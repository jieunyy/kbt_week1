package user;

public class VIPCustomer extends User{

    // 필드


    // 생성자
    public VIPCustomer(String name) {
        super(name);
    }


    // 메소드
    public boolean isDeliveryFree() {
        return true;
    }
}
