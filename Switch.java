public class Switch {
        boolean isFilled;
        double billAmount;
        String shipping;

        public Switch(boolean filled, double cost, String shippingMethod) {

            if (cost > 24.00) {
                System.out.println("High value item!");
            }
            isFilled = filled;
            billAmount = cost;
            shipping = shippingMethod;
        }

        public void ship() {
            if (isFilled) {
                System.out.println("Shipping");
                System.out.println("Shipping cost: " + calculateShipping());
            } else {
                System.out.println("Order not ready");
            }
        }

        public double calculateShipping() {
            double shippingCost;
            switch(shipping) {
                case("Regular"):
                    shippingCost = 0;
                    break;
                case("Express"):
                    shippingCost = 1.75;
                    break;
                default:
                    shippingCost = 0.50;
            }
            return shippingCost;
        }

        public static void main(String[] args) {
            Switch book = new Switch(true, 9.99, "Express");
            Switch chemistrySet = new Switch(false, 72.50, "Regular");

            book.ship();
            chemistrySet.ship();
        }
}
