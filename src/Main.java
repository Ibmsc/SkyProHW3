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


        System.out.println("Задача №3");
        /* Напишите программу, которая определяет, является ли год високосным или нет.
        Переменная year = 2021
        Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        « .. год является високосным» или «... год не является високосным».
        Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        Также високосным является каждый четырехсотый год.
        */

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным!");
        }else {
            System.out.println(year + " год не является високосным!");
        }

        System.out.println("Задача №4");

        /* Напишите программу, которая выдает сообщение в консоль:
        "Потребуется дней: " + срок доставки.
        Правила доставки такие:
        Доставка в пределах 20 км занимает сутки
        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки
        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        */

        int deliveryDistance = 95;
        int day = 1;
        if(deliveryDistance <=20) {
            System.out.println("Потребуется дней " + day);
        }else{
            if (deliveryDistance >= 20 && deliveryDistance < 60)
                System.out.println("Потребуется дней " + day*2);
            else
                if(deliveryDistance >= 60 && deliveryDistance <100)
                System.out.println("Потребуется дней " + day * 3);
                else
                    if(deliveryDistance >=100)
                        System.out.println("Потребуется более 3 дней.");

        }

        System.out.println("Задача №5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний месяц!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц!");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
        }
    }
