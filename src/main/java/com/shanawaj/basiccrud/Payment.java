package com.shanawaj.basiccrud;

interface Payment {
    void pay();
//     default void pay(){
//        System.out.println("payments are essential");
//    }
}
class Upipayment implements Payment {
    @Override
    public void pay() {
        System.out.println("payment done by UPI");
    }


}
class Cardpayment implements Payment {
    @Override
    public void pay() {
        System.out.println("payment done by CARD");
    }
}