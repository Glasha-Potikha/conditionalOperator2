public class Main {
    public static void main(String[] args) {
//Задача №1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша ОС к сожалению не поддерживается нашим предложением:(");
        }
//Задача №2

        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//Задача №3
        int year = 2100;
        if (year < 1584 || (year % 100 == 0 && year % 400 != 0)) {//прописываем исключение
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {//прописываем правило
            System.out.println(year + " год является високосным");
        } else {//все остальное
            System.out.println(year + " год не является високосным");
        }
//Задача №4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: сутки");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: двое суток");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: трое суток");
        } else {
            System.out.println("Мы не сможем осуществить доставку");
        }
//Задача №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Некорректный ввод данных");
        }
    }
}