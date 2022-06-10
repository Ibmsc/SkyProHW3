public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 3");


        System.out.println("Задача №1");

           //Объявите переменную clientOS, которая равна 0 или 1. Где 0 — iOS, 1 — Android.

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача №2");

        /*Если телефон произведен с 2015 по н.в.,то все ок
          Если телефон ранее 2015,то клиенту "Установите облегченную версию приложения для iOS(Android) по ссылке"
          Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий :
          операционной системы телефона (iOS или Android) и года производства.
          Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать любой желаемый год.
          */

        int clientOS2 = 0;
        int clientDeviceYear = 2014;
        if(clientOS2 == 0 ){
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }


    }
}