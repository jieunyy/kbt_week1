package user;

import cart.Cart;
import cart.CartItem;
import order.Order;
import restaurant.Customization;
import restaurant.Menu;
import restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends User{

    // 필드


    // 생성자


    // 메소드
    public Restaurant selectRestaurant(List<Restaurant> restaurants, String rName) {
        for(Restaurant restaurant : restaurants) {
            if(rName.equals(restaurant.getrName())) {
                System.out.printf("%s 식당이 선택되었습니다.%n", restaurant.getrName().toString());
                return restaurant;
            }
        }
        System.out.println("해당 이름의 식당이 없습니다. 다시 선택해주세요.");
        return null;
    }

    public Menu selectMenu(Restaurant restaurant, String selectedMenu) {
        List<Menu> menuList = restaurant.getMenuList();
        Scanner sc = new Scanner(System.in);

        for(Menu menu : menuList) {
            if(menu.getItemName().equals(selectedMenu)) {
                System.out.println("메뉴가 선택되었습니다.");
                System.out.println(selectedMenu);

                System.out.println("수량을 선택해주세요.");
                int quantity = Integer.parseInt(sc.nextLine());
                System.out.printf("%s 메뉴가 %d개 선택되었습니다.%n", menu.getItemName(), quantity);

                List<Customization> customizations = menu.getCustomizations();

                if(customizations.size() == 0) {
                    System.out.println("사이드 메뉴가 없는 메뉴입니다.");

                }
                else {
                    System.out.println("━━━━━━━━━━━━━⊱사이드메뉴⊰━━━━━━━━━━━━━");
                    for (Customization customization : customizations) {
                        System.out.println(String.format(":::::   %s  %d", customization.getItemName(), customization.getItemPrice()));
                    }
                    System.out.println("━━━━━━━━━━━━━━━━━⊱⊰━━━━━━━━━━━━━━━━");
                    System.out.println("사이드 메뉴를 선택해주세요.");

                    String side = sc.nextLine();

                    List<Customization> selectedCustomization = new ArrayList<>();
                    for (Customization customization : customizations) {
                        if (customization.getItemName().equals(side)) {
                            selectedCustomization.add(customization);
                            System.out.println("사이드 메뉴가 선택되었습니다.");
                            System.out.println(side);

                            System.out.println("수량을 선택해주세요.");
                            int sideQuantity = Integer.parseInt(sc.nextLine());
                            System.out.printf("%s 메뉴가 %d개 선택되었습니다.%n", side, sideQuantity);
                        }
                    }
                    menu.setCustomizations(selectedCustomization);
                }
                return menu;
            }
        }
        System.out.println("해당 메뉴가 없습니다. 다시 선택해주세요.");
        return null;
    }
}
