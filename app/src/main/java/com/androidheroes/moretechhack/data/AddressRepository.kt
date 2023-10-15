package com.androidheroes.moretechhack.data


object AddressRepository {


    fun getBanks(): List<BankInfo> {
        return listOf(
            BankInfo(
                1,
                "ДО «ГУМ» Филиала № 7701 Банка ВТБ (ПАО)",
                "г. Москва, Б. Черкасский пер. , д. 10/11, стр. 1",
                "+7 (495) 637-37-83",
                "Открыто до 22:00",
                Pair(55.740624, 37.590686),
                District.CAO
            ),
            BankInfo(
                2,
                "Банк ВТБ",
                "Токмаков пер., д. 8",
                "+7 (499) 261-03-83",
                "Открыто до 22:00",
                Pair(55.766385, 37.669208),
                District.CAO
            ),
            BankInfo(
                3,
                "Банк ВТБ",
                "Ул. Покровка, д. 39, стр. 3",
                "+7 (495) 917-56-77",
                "Открыто до 22:00",
                Pair(55.762373, 37.651250),
                District.CAO
            ),
            BankInfo(
                4,
                "Банк ВТБ",
                "Малый Строченовский пер., д. 14, стр. 1",
                "+7 (499) 236-30-72",
                "Открыто до 22:00",
                Pair(55.726046, 37.632592),
                District.CAO
            ),
            BankInfo(
                5,
                "Банк ВТБ",
                "Большой Могильцевский пер.,д. 4-6",
                "+7 (499) 241-41-23",
                "Открыто до 22:00",
                Pair(55.743887, 37.589734),
                District.CAO,
                area = "Фортепиано"

            ),
            BankInfo(
                6,
                "Банк ВТБ",
                "Ул. 1905 года, д. 8",
                "+7 (499) 252-26-23",
                "Открыто до 22:00",
                Pair(55.767089, 37.560233),
                District.CAO
            ),
            BankInfo(
                7,
                "Банк ВТБ",
                "Ул. Палиха, д. 14/33, стр. 1",
                "+7 (499) 973-22-47",
                "Открыто до 22:00",
                Pair(55.784597, 37.600783),
                District.CAO
            ),
            BankInfo(
                8,
                "Банк ВТБ",
                "Ул. Большая Якиманка, д. 29",
                "+7 (499) 238-75-00",
                "Открыто до 22:00",
                Pair(55.735778, 37.614347),
                District.CAO
            ),
            BankInfo(
                9,
                "Банк ВТБ",
                "Ул. Воронцовская, д. 30А",
                "+7 (495) 912-75-85",
                "Открыто до 22:00",
                Pair(55.735677, 37.660018),
                District.CAO
            ),
            BankInfo(
                10,
                "Банк ВТБ",
                "Таганская ул., д. 9, стр. 5.",
                "+7 (495) 912-14-28",
                "Открыто до 22:00",
                Pair(55.741404, 37.660620),
                District.CAO
            ),
            BankInfo(
                11,
                "Банк ВТБ",
                "Докучаев пер., д. 7, стр. 1.",
                "+7 (499) 975-18-43",
                "Открыто до 22:00",
                Pair(55.774482, 37.642671),
                District.CAO
            ),
            BankInfo(
                12,
                "Банк ВТБ",
                "Большая Переяславская ул., д. 8А",
                "+7 (495) 684-50-58",
                "Открыто до 22:00",
                Pair(55.781767, 37.643013),
                District.CAO
            ),
            BankInfo(
                13,
                "Банк ВТБ",
                "Ул. Николоямская, д. 42",
                "+7 (495) 915-31-51",
                "Открыто до 22:00",
                Pair(55.746907, 37.659748),
                District.CAO
            ),
            BankInfo(
                14,
                "Банк ВТБ",
                "Ул. Воронцовская, д. 15/10, стр. 1",
                "+7 (495)912-59-93",
                "Открыто до 22:00",
                Pair(55.738520, 37.657323),
                District.CAO
            ),
            BankInfo(
                15,
                "Банк ВТБ",
                "Пр-т Мира, д. 71, стр. 3",
                "+7 (495) 681-35-62",
                "Открыто до 22:00",
                Pair(55.788252, 37.633769),
                District.CAO
            ),
            BankInfo(
                16,
                "Банк ВТБ",
                "Чистый пер., д. 7.",
                "+7 (495) 637-35-60",
                "Открыто до 22:00",
                Pair(55.742742, 37.590973),
                District.CAO
            ),
            BankInfo(
                17,
                "Банк ВТБ",
                "Ул. Трехгорный Вал, д. 2/4, стр. 1",
                "+7 (499) 255-59-96",
                "Открыто до 22:00",
                Pair(55.758590, 37.562227),
                District.CAO
            ),
            BankInfo(
                18,
                "Банк ВТБ",
                "Ул. Средняя Переяславская,д. 7/2, стр. 1",
                "+7 (495) 681-82-00",
                "Открыто до 22:00",
                Pair(55.788707, 37.637245),
                District.CAO
            ),
            BankInfo(
                19,
                "Банк ВТБ",
                "Ул. Красина, д. 27",
                "+7 (499) 251-49-21",
                "Открыто до 22:00",
                Pair(55.768603, 37.585170),
                District.CAO
            ),
            BankInfo(
                20,
                "Банк ВТБ",
                "Ул. Пречистенка, д. 32/1, стр.1",
                "+7 (495) 637-44-34",
                "Открыто до 22:00",
                Pair(55.740624, 37.590686),
                District.CAO
            ),
            BankInfo(
                21,
                "Банк ВТБ",
                "Ул. Зоологическая, д. 18",
                "+7 (499) 766-21-72",
                "Открыто до 22:00",
                Pair(55.765073, 37.582799),
                District.CAO
            ),
            BankInfo(
                22,
                "Банк ВТБ",
                "Ул. Садовническая, д. 19, стр. 1",
                "+7 (495) 953-91-39",
                "Открыто до 22:00",
                Pair(55.746725, 37.632925),
                District.CAO
            ),
            BankInfo(
                23,
                "Банк ВТБ",
                "Ул. Верхняя Красносельская, д. 7А, стр. 1",
                "+7 (499) 264-89-47",
                "Открыто до 22:00",
                Pair(55.785422, 37.662030),
                District.CAO
            ),
            BankInfo(
                24,
                "Банк ВТБ",
                "Чапаевский пер., д. 5А",
                "+7 (499) 157-68-42",
                "Открыто до 22:00",
                Pair(55.796618, 37.518910),
                District.SAO
            ),
            BankInfo(
                25,
                "Банк ВТБ",
                "Ул. Клинская, д. 8А",
                "+7 (495) 451-30-98",
                "Открыто до 22:00",
                Pair(55.869612, 37.497917),
                District.SAO
            ),
            BankInfo(
                26,
                "Банк ВТБ",
                "Ул. Фестивальная, д. 61Б",
                "+7 (495) 455-77-44",
                "Открыто до 22:00",
                Pair(55.862934, 37.496506),
                District.SAO
            ),
            BankInfo(
                27,
                "Банк ВТБ",
                "Петровско-Разумовский пр-д, д. 16, корп. 2.",
                "+7 (495) 685-76-14",
                "Открыто до 22:00",
                Pair(55.798748, 37.569378),
                District.SAO
            ),
            BankInfo(
                28,
                "Банк ВТБ",
                "Ул. Ивановская, д. 14",
                "+7 (499) 977-16-01",
                "Открыто до 22:00",
                Pair(55.819287, 37.571103),
                District.SAO
            ),
            BankInfo(
                29,
                "Банк ВТБ",
                "Волоколамское ш., д. 12",
                "+7 (499) 158-14-16",
                "Открыто до 22:00",
                Pair(55.809383, 37.495842),
                District.SAO
            ),
            BankInfo(
                30,
                "Банк ВТБ",
                "Кронштадтский бул., д. 49А",
                "+7 (495) 456-55-46",
                "Открыто до 22:00",
                Pair(55.853026, 37.510906),
                District.SAO
            ),
            BankInfo(
                31,
                "Банк ВТБ",
                "Ул. Базовская, д. 16",
                "+7 (499) 906-81-11",
                "Открыто до 22:00",
                Pair(55.877889, 37.512011),
                District.SAO
            ),
            BankInfo(
                32,
                "Банк ВТБ",
                "Ул. Долгопрудная, д. 10А",
                "+7 (495) 485-25-73",
                "Открыто до 22:00",
                Pair(55.894818, 37.538889),
                District.SAO
            ),
            BankInfo(
                33,
                "Банк ВТБ",
                "Ул. Генерала Рычагова, д. 20А",
                "+7 (499) 154-70-23",
                "Открыто до 22:00",
                Pair(55.840563, 37.539742),
                District.SAO
            ),
            BankInfo(
                34,
                "Банк ВТБ",
                "Бескудниковский бул., д. 53А",
                "+7 (499) 489-52-36",
                "Открыто до 22:00",
                Pair(55.871193, 37.542329),
                District.SAO
            ),
            BankInfo(
                35,
                "Банк ВТБ",
                "Ул. Бусиновская горка, д. 5",
                "+7 (495) 486-57-51",
                "Открыто до 22:00",
                Pair(55.882404, 37.494189),
                District.SAO
            ),
            BankInfo(
                36,
                "Банк ВТБ”",
                "Ул. Большая Академическая, д. 11А",
                "+7 (499) 767-08-76",
                "class@vtb.ru",
                Pair(55.821998, 37.525010),
                District.SAO
            ),
            BankInfo(
                37,
                "Банк ВТБ",
                "Дмитровское ш., д. 34, корп. 2",
                "+7 (499) 488-70-21",
                "Открыто до 22:00",
                Pair(55.840219, 37.574615),
                District.SAO
            ),
            BankInfo(
                38,
                "Банк ВТБ",
                "Ул. Образцова, д. 4А",
                "+7 (495) 197-72-51",
                "Открыто до 22:00",
                Pair(55.786354, 37.608365),
                District.SBAO
            ),
            BankInfo(
                39,
                "Банк ВТБ",
                "Ул. Снежная, д. 24",
                "+7 (499) 180-00-66",
                "Открыто до 22:00",
                Pair(55.853526, 37.650289),
                District.SBAO
            ),
            BankInfo(
                40,
                "Банк ВТБ",
                "Северный бул., д. 7, корп. 1",
                "+7 (499) 204-12-36",
                "Открыто до 22:00",
                Pair(55.866793, 37.605382),
                District.SBAO
            )


        )
    }
}

data class BankInfo(
    var id: Int,
    var title: String,
    var address: String,
    var phone: String,
    var time: String,
    var location: Pair<Double, Double>,
    var district: District,
    var area: String = "",
    // Количество сотрудников
    var managersCount: Int = 10,
    // Среднее число посетитетелей в час
    var averagePeopleCount: Int = 100,
    // Число посетителей каждый час - массив из 10 чисел (9 часов работы офиса)
    var currentPeopleCount: List<Int> = listOf(50, 100, 150, 200, 250, 300, 250, 200, 150),
    var generalAvailability: Int = averagePeopleCount / managersCount
) {

    // Получаем загрузку офиса для каждого часа
    fun getAvailability(hour: Int): Availability {

        val index = hour % 10 // в массиве загрузка каждый час от 10 утра до 19 часов
        val count = currentPeopleCount[index]

        // Рассчитываем количество посетителей на каждого сотрудника офиса
        // Пример 50 посетителей / 10 сотрудников = 5 посетителей в час на сотрудника
        // Учитывая 10 минут на каждого, то за 1 час менеджер обрабатывает 6 человек
        // Отсюда решаем: что если загрузка
        // < 6 -> LOW
        // 6 человек -> MID
        // 6 > -> HIGH
        // 12 > -> EX_HIGH
        val availability = count / managersCount
        if (availability < 6) return Availability.LOW
        if (availability == 6) return Availability.MID
        if (availability in 7..11) return Availability.HIGH
        else return Availability.EX_HIGH
    }

}

// Загрузка офиса
enum class Availability(val title:String) {
    // Низкая
    LOW("Низкая"),

    // Среднее
    MID("Средняя"),

    // Высокая
    HIGH("Высокая"),

    // Очень высокая
    EX_HIGH("Очень высокая")
}

enum class District {
    CAO,
    SAO,
    SBAO,
    BAO,
    YBAO,
    YAO,
    YZAO,
    ZAO,
    SZAO,
    ZelAO,
    TinAO
}