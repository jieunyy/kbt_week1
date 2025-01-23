package order;

public enum OrderStatus {

    //  필드
    주문대기,
    결제완료,
    가게승인,
    조리완료,
    배달시작,
    배달완료,
    수령완료;


    // 메서드
    public OrderStatus nextOrderStatus(OrderType orderType, OrderStatus orderStatus) {
        switch(this) {
            case 주문대기:
                return 결제완료;
            case 결제완료:
                return 가게승인;
            case 가게승인:
                return 조리완료;
            case 조리완료:
                return orderType == OrderType.배달 ? 배달시작 : 수령완료;
            case 배달시작:
                return 배달완료;
            case 배달완료:
                return 수령완료;
            default:
                throw new IllegalStateException("더이상 진행할 수 없는 상태");
        }
    }
}
