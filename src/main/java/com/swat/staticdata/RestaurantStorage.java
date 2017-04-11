package com.swat.staticdata;

import com.swat.data.RestaurantData;

/**
 * Created by Alex on 03.04.17.
 */

public class RestaurantStorage {
    public static final RestaurantData restaurantForRegistrationGeneral = new RestaurantData("test-2",
            "Тестовый ресторан", "Test Restaurant", "Тестовий ресторан", "Одесса", "Конная, 1","Konnaia, 1","Кінна, 1",
            "01:00", "02:00", "Текстовое описание о ресторане.", "Text description of the restaurant.", "Текстовий опис про ресторан.",
            "+380501234567", "restaurant1@restaurant1.restaurant1", "restaurant1.od.ua");
    public static final RestaurantData restaurantNameRu = new RestaurantData("Тестовый ресторан");
}