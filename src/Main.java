public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.age = 29;
        client.integrityOfTheCar = 5;
        client.distance = 20;
        client.driverRating = 2.4;
        client.drivingExpirience = client.age - 18;

        Rent rent = new Rent();
        rent.discount = 5; // скидка в %
        rent.rentalPriceEconomyClass = 15;
        rent.rentalPriceComfortClass = 25;
        rent.rentalPriceBusinessClass = 40;

        Rent firstCarClass = new Rent();
        Rent secondCarClass = new Rent();
        Rent threeCarClass = new Rent();
        firstCarClass.carClass = "Эконом Класс"; //Economy Class
        secondCarClass.carClass = "Комфорт Класс"; //Comfort Class
        threeCarClass.carClass = "Бизнесс класс"; //Business Class

        Broker broker = new Broker();
        broker.staff = 18;
        broker.tracking = 1;

        int choiceWithSmallerRating = 0; // 0 == Эконом класс || 1 == Комфорт класс || 2 == Бизнес класс
        int choiceWithMiddleRating = 0; // 0 == Эконом класс || 1 == Комфорт класс || 2 == Бизнес класс
        int choiceWithHighRating = 3; // 0 == Эконом класс || 1 == Комфорт класс || 2 == Бизнес класс

        Broker nameAutoPark = new Broker();
        nameAutoPark.autoPark = "Бебра Автопарк";

        Broker nameCarSharing = new Broker();
        nameCarSharing.carSharing = "Бебра Каршеринг";

        double priceWithSmallerRating = rent.rentalPriceEconomyClass * client.distance;
        double priceWithSmallerRatingAndWithDiscount = priceWithSmallerRating * (100 - rent.discount) / 100;
        double discountInRubSmallerRating = priceWithSmallerRating - priceWithSmallerRatingAndWithDiscount;

        double priceWithMiddleRating = rent.rentalPriceComfortClass * client.distance;
        double priceWithMiddleRatingAndWithDiscount = priceWithMiddleRating * (100 - rent.discount) / 100;
        double discountInRubMiddleRating = priceWithMiddleRating - priceWithMiddleRatingAndWithDiscount;

        double priceWithHighRating = rent.rentalPriceBusinessClass * client.distance;
        double priceWithHighRatingAndWithDiscount = priceWithHighRating * (100 - rent.discount) / 100;
        double discountInRubHighRating = priceWithHighRating - priceWithHighRatingAndWithDiscount;

        if (client.age >= 18){
            switch (broker.tracking){
                case default:
                    System.out.println();
                    System.out.println("Машина не исправна, возьмите другой автомобиль!");
                    break;
                case 1:
                    System.out.println();
                    System.out.println("Добро пожаловать в " + nameCarSharing.carSharing +
                            ". Мы используем автопарк под названием: " + nameAutoPark.autoPark + ".");
                    System.out.println();
                    System.out.println("На данный момент в нашем приложении, есть такие классы: " +
                            firstCarClass.carClass + ", " + secondCarClass.carClass + ", " +
                            threeCarClass.carClass + ".");
                    System.out.println();
                    System.out.println("Ваш водительский стаж " + client.drivingExpirience + " лет!");
                    System.out.println("Ваш рейтинг в нашем приложеннии составляет " + client.driverRating
                            + " звезду.");
                    System.out.println();
                    System.out.println("Вы должны после каждой поездки делать фотографии автомобиля и если " +
                            "вы что-то повредили, должны показать фотографиями , где именно.");
                    System.out.println("На данный момент целостность авто по отзывам составляет: "
                            + client.integrityOfTheCar + " баллов из 5");
                    System.out.println();

                    if (client.driverRating <= 2.5){
                        System.out.println("Вам доступен только Эконом класс! " +
                                "Повысьте рейтинг водителя и вам будут доступны другие классы " +
                                "автомобилей!");

                        switch (choiceWithSmallerRating){
                            case 0:
                                System.out.println("Итого: за " + client.distance + " километров, вы платите " +
                                        "без скидки: " + priceWithSmallerRating + " рублей. Ваша скидка: "
                                        + discountInRubSmallerRating + " рублей. Цена со" + " скидкой: "
                                        + priceWithSmallerRatingAndWithDiscount + " рублей.");
                                break;
                            case 1:
                            case 2:
                                System.out.println("Вам недоступен этот класс!");
                                break;
                            case default:
                                System.out.println("Такого класса автомобилей в нашем приложении нет!");
                                break;
                        }
                    } else if (client.driverRating <= 4.0){
                        System.out.println("Вам доступен Эконом и Комфорт класс! Повысьте рейтинг водителя и " +
                                "вам будет доступен Бизнес Класс!");

                        switch (choiceWithMiddleRating){
                            case 0:
                                System.out.println("Итого: за " + client.distance + " километров, вы платите " +
                                        "без скидки: " + priceWithSmallerRating + " рублей. Ваша скидка: "
                                        + discountInRubSmallerRating + " рублей. Цена со" + " скидкой: "
                                        + priceWithSmallerRatingAndWithDiscount + " рублей.");
                                break;
                            case 1:
                                System.out.println("Итого: за " + client.distance + " километров, вы платите " +
                                        "без скидки: " + priceWithMiddleRating + " рублей. Ваша скидка: "
                                        + discountInRubMiddleRating + " рублей. Цена со" + " скидкой: "
                                        + priceWithMiddleRatingAndWithDiscount + " рублей.");
                                break;
                            case 2:
                                System.out.println("Вам недоступен этот класс");
                                break;
                            case default:
                                System.out.println("Такого класса автомобилей в нашем приложении нет!");
                                break;
                        }
                    } else if (client.driverRating <= 5.0){
                        System.out.println("Вам доступны все классы: Эконом, Комфорт и Бизнес класс!");

                        switch (choiceWithHighRating){
                            case 0:
                                System.out.println("Итого: за " + client.distance + " километров, вы платите " +
                                        "без скидки: " + priceWithSmallerRating + " рублей. Ваша скидка: "
                                        + discountInRubSmallerRating + " рублей. Цена со" + " скидкой: "
                                        + priceWithSmallerRatingAndWithDiscount + " рублей.");
                                break;
                            case 1:
                                System.out.println("Итого: за " + client.distance + " километров, вы платите " +
                                        "без скидки: " + priceWithMiddleRating + " рублей. Ваша скидка: "
                                        + discountInRubMiddleRating + " рублей. Цена со" + " скидкой: "
                                        + priceWithMiddleRatingAndWithDiscount + " рублей.");
                                break;
                            case 2:
                                System.out.println("Итого: за " + client.distance + " километров, вы платите " +
                                        "без скидки: " + priceWithHighRating + " рублей. Ваша скидка: "
                                        + discountInRubHighRating + " рублей. Цена со" + " скидкой: "
                                        + priceWithHighRatingAndWithDiscount + " рублей.");
                                break;
                            case default:
                                System.out.println("Такого класса автомобилей в нашем приложении нет!");
                                break;
                        }
                    } else {
                        System.out.println("Таких баллов в приложении не существует!");
                    }
                break;
            }
        } else {
            System.out.println("Вам нет 18 лет!");
        }
    }
}