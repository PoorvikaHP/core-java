class JuiceShopRunner {

    public static void main(String[] args) {

        JuiceShop shop1 = new JuiceShop();
        shop1.checkJuiceByName("Orange Juice");
        shop1.checkJuiceByName("Apple Juice");
        shop1.checkJuiceByName("Badam Milk");   
        shop1.checkJuiceByName("Pineapple Juice");

        System.out.println("-----------------");

        JuiceShop shop2 = new JuiceShop();
        shop2.checkJuiceByName("Watermelon Juice");
        shop2.checkJuiceByName("Rose Milk");    
        shop2.checkJuiceByName("Lemon Juice");
        shop2.checkJuiceByName("Carrot Juice");

        System.out.println("------------");

        JuiceShop shop3 = new JuiceShop();
        shop3.checkJuiceByName("Mixed Fruit Juice");
        shop3.checkJuiceByName("Pomegranate Juice");
        shop3.checkJuiceByName("Chocolate Shake"); 
        shop3.checkJuiceByName("Apple Juice");

        System.out.println("-----");

        JuiceShop shop4 = new JuiceShop();
        shop4.checkJuiceByName("Mango Juice");
        shop4.checkJuiceByName("Ice Cream Shake"); 
        shop4.checkJuiceByName("Lemon Juice");
        shop4.checkJuiceByName("Carrot Juice");

        System.out.println("---------");

        JuiceShop shop5 = new JuiceShop();
        shop5.checkJuiceByName("Cold Coffee");  
        shop5.checkJuiceByName("Milkshake");    
        shop5.checkJuiceByName("Grape Juice");
        shop5.checkJuiceByName("Apple Juice");
    }
}