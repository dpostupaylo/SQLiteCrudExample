package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DataBaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);

//        dataBaseHandler.addCar(new Car("Toyota", "30000$"));
//        dataBaseHandler.addCar(new Car("Nissan", "25000$"));
//        dataBaseHandler.addCar(new Car("Opel", "10000$"));
//        dataBaseHandler.addCar(new Car("BMW", "45000$"));

        List<Car> cars = dataBaseHandler.getAllCars();

        for (Car car : cars){
            Log.d("Car info:", "ID " + car.getId() + " NAME " + car.getName() + " PRICE " + car.getPrice() );
        }

//        Car car = dataBaseHandler.getCar(2);
//        Log.d("OneCarInfo:", "ID " + car.getId() + " NAME " + car.getName() + " PRICE " + car.getPrice() );
//
//        car.setName("Tesla");
//        car.setPrice("50000$");
//
//        dataBaseHandler.updateCar(car);
//
//        Log.d("OneCarInfo:", "ID " + car.getId() + " NAME " + car.getName() + " PRICE " + car.getPrice() );

    }
}
