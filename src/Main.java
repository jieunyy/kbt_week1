import restaurant.Customization;
import restaurant.Menu;
import restaurant.Restaurant;
import user.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurantList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 식당 초기화
        // public Restaurant(String rName, String rLocation, String rCategory, double rRate,
        // int rDeliveryFee, int rMinOrderAmount, int rDeliveryTime)
        Restaurant r1 = new Restaurant("맥도날드", "서울시 용산구", "패스트푸트",
                                        4.8, 3000, 12000, 50);

        // public Menu(String itemName, int itemPrice,
        //                String category, List<Customization> customization
        List<Menu> r1MenuList = new ArrayList<>();
        List<Customization> customizations = Arrays.asList(
                new Customization("후렌치 후라이 스몰", 2300, "스낵"),
                new Customization("후렌치 후라이 미디움", 2800, "스낵"),
                new Customization("후렌치 후라이 라지", 3300, "스낵")
        );

        Menu r1Menu = new Menu("빅맥", 6300, "버거", customizations);
        r1MenuList.add(r1Menu);
        r1.addMenus(r1MenuList);

        restaurantList.add(r1);

        Customer customer = new Customer();

        //
        System.out.println("식당 조회");

        for(Restaurant restaurant : restaurantList) {
            System.out.println("━━━━━━━━━━━━━━━━⊱⋆⊰━━━━━━━━━━━━━━━━");
            System.out.printf(".•☀ %s%n", restaurant.getrName());
            System.out.printf(".•☀평점 %s%n", restaurant.getrRate());
            System.out.printf(".•☀%s분 소요%n", restaurant.getrDeliveryTime());
            System.out.printf(".•☀배달팁 %s%n", restaurant.getrDeliveryFee());
            System.out.printf(".•☀최소 주문 %s%n", restaurant.getrMinOrderAmount());
        }
        System.out.println("━━━━━━━━━━━━━━━━⊱⋆⊰━━━━━━━━━━━━━━━━");

        System.out.println("식당을 선택해주세요.");
        String selectedRestaurant = sc.nextLine();
        Restaurant restaurant = customer.selectRestaurant(restaurantList, selectedRestaurant);

        System.out.println("메뉴를 선택해주세요.");
        List<Menu> menuList = restaurant.getMenuList();
        for(Menu menu : menuList) {
            System.out.printf("\uD80C\uDFF2๋࣭࣪˖ %s  %d", menu.getItemName(), menu.getItemPrice());
        }
        String selectedMenu = sc.nextLine();
        Menu comfirmedMenu = customer.selectMenu(restaurant, selectedMenu);  /////// 네이밍 다시

        System.out.println("선택하신 음식은 다음과 같습니다.");
        System.out.println(comfirmedMenu.getItemName());
        System.out.println(comfirmedMenu.getCustomizations());  ///// 다시 처리 배열을 하나의 문자열로
        // 아래에서도 단일 상품 가격만 집계됨. 계속 카운트 되게
        System.out.printf("총 가격은 %d원입니다. 카트에 담으시겠습니까?%n", comfirmedMenu.getItemPrice());
    }
}