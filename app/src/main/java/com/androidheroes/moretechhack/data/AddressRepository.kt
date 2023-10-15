package com.androidheroes.moretechhack.data


object AddressRepository {


    fun getBanks(): List<BankInfo> {
        return listOf(
            BankInfo(
                1,
                "ДО «ГУМ» Филиала № 7701 Банка ВТБ (ПАО)",
                "г. Москва, Б. Черкасский пер. , д. 10/11, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.740624, 37.590686),
                District.CAO
            ),
            BankInfo(
                2,
                "Банк ВТБ",
                "Токмаков пер., д. 8",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.766385, 37.669208),
                District.CAO
            ),
            BankInfo(
                3,
                "Банк ВТБ",
                "Ул. Покровка, д. 39, стр. 3",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.762373, 37.651250),
                District.CAO
            ),
            BankInfo(
                4,
                "Банк ВТБ",
                "Малый Строченовский пер., д. 14, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.726046, 37.632592),
                District.CAO
            ),
            BankInfo(
                5,
                "Банк ВТБ",
                "Большой Могильцевский пер.,д. 4-6",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.743887, 37.589734),
                District.CAO,
                area = "Фортепиано"

            ),
            BankInfo(
                6,
                "Банк ВТБ",
                "Ул. 1905 года, д. 8",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.767089, 37.560233),
                District.CAO
            ),
            BankInfo(
                7,
                "Банк ВТБ",
                "Ул. Палиха, д. 14/33, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.784597, 37.600783),
                District.CAO
            ),
            BankInfo(
                8,
                "Банк ВТБ",
                "Ул. Большая Якиманка, д. 29",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.735778, 37.614347),
                District.CAO
            ),
            BankInfo(
                9,
                "Банк ВТБ",
                "Ул. Воронцовская, д. 30А",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.735677, 37.660018),
                District.CAO
            ),
            BankInfo(
                10,
                "Банк ВТБ",
                "Таганская ул., д. 9, стр. 5.",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.741404, 37.660620),
                District.CAO
            ),
            BankInfo(
                11,
                "Банк ВТБ",
                "Докучаев пер., д. 7, стр. 1.",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.774482, 37.642671),
                District.CAO
            ),
            BankInfo(
                12,
                "Банк ВТБ",
                "Большая Переяславская ул., д. 8А",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.781767, 37.643013),
                District.CAO
            ),
            BankInfo(
                13,
                "Банк ВТБ",
                "Ул. Николоямская, д. 42",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.746907, 37.659748),
                District.CAO
            ),
            BankInfo(
                14,
                "Банк ВТБ",
                "Ул. Воронцовская, д. 15/10, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.738520, 37.657323),
                District.CAO
            ),
            BankInfo(
                15,
                "Банк ВТБ",
                "Пр-т Мира, д. 71, стр. 3",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.788252, 37.633769),
                District.CAO
            ),
            BankInfo(
                16,
                "Банк ВТБ",
                "Чистый пер., д. 7.",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.742742, 37.590973),
                District.CAO
            ),
            BankInfo(
                17,
                "Банк ВТБ",
                "Ул. Трехгорный Вал, д. 2/4, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.758590, 37.562227),
                District.CAO
            ),
            BankInfo(
                18,
                "Банк ВТБ",
                "Ул. Средняя Переяславская,д. 7/2, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.788707, 37.637245),
                District.CAO
            ),
            BankInfo(
                19,
                "Банк ВТБ",
                "Ул. Красина, д. 27",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.768603, 37.585170),
                District.CAO
            ),
            BankInfo(
                20,
                "Банк ВТБ",
                "Ул. Пречистенка, д. 32/1, стр.1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.740624, 37.590686),
                District.CAO
            ),
            BankInfo(
                21,
                "Банк ВТБ",
                "Ул. Зоологическая, д. 18",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.765073, 37.582799),
                District.CAO
            ),
            BankInfo(
                22,
                "Банк ВТБ",
                "Ул. Садовническая, д. 19, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.746725, 37.632925),
                District.CAO
            ),
            BankInfo(
                23,
                "Банк ВТБ",
                "Ул. Верхняя Красносельская, д. 7А, стр. 1",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.785422, 37.662030),
                District.CAO
            ),
            BankInfo(
                24,
                "Банк ВТБ",
                "Чапаевский пер., д. 5А",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.796618, 37.518910),
                District.SAO
            ),
            BankInfo(
                25,
                "Банк ВТБ",
                "Ул. Клинская, д. 8А",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.869612, 37.497917),
                District.SAO
            ),
            BankInfo(
                26,
                "Банк ВТБ",
                "Ул. Фестивальная, д. 61Б",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.862934, 37.496506),
                District.SAO
            ),
            BankInfo(
                27,
                "Банк ВТБ",
                "Петровско-Разумовский пр-д, д. 16, корп. 2.",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.798748, 37.569378),
                District.SAO
            ),
            BankInfo(
                28,
                "Банк ВТБ",
                "Ул. Ивановская, д. 14",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.819287, 37.571103),
                District.SAO
            ),
            BankInfo(
                29,
                "Банк ВТБ",
                "Волоколамское ш., д. 12",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.809383, 37.495842),
                District.SAO
            ),
            BankInfo(
                30,
                "Банк ВТБ",
                "Кронштадтский бул., д. 49А",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.853026, 37.510906),
                District.SAO
            ),
            BankInfo(
                31,
                "Банк ВТБ",
                "Ул. Базовская, д. 16",
                "8 (800) 100-24-24",
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
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.840563, 37.539742),
                District.SAO
            ),
            BankInfo(
                34,
                "Банк ВТБ",
                "Бескудниковский бул., д. 53А",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.871193, 37.542329),
                District.SAO
            ),
            BankInfo(
                35,
                "Банк ВТБ",
                "Ул. Бусиновская горка, д. 5",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.882404, 37.494189),
                District.SAO
            ),
            BankInfo(
                36,
                "Банк ВТБ”",
                "Ул. Большая Академическая, д. 11А",
                "8 (800) 100-24-24",
                "class@vtb.ru",
                Pair(55.821998, 37.525010),
                District.SAO
            ),
            BankInfo(
                37,
                "Банк ВТБ",
                "Дмитровское ш., д. 34, корп. 2",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.840219, 37.574615),
                District.SAO
            ),
            BankInfo(
                38,
                "Банк ВТБ",
                "Ул. Образцова, д. 4А",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.786354, 37.608365),
                District.SBAO
            ),
            BankInfo(
                39,
                "Банк ВТБ",
                "Ул. Снежная, д. 24",
                "8 (800) 100-24-24",
                "Открыто до 22:00",
                Pair(55.853526, 37.650289),
                District.SBAO
            ),
            BankInfo(
                40,
                "Банк ВТБ",
                "Северный бул., д. 7, корп. 1",
                "8 (800) 100-24-24",
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