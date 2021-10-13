package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

   public static List<Task> getTasks(){
       List<Task> tasks = new ArrayList<>();
       tasks.add(new Task("Guest List", LocalDate.of(2021,9,1),LocalDate.of(2021,10,10)));
       tasks.add(new Task("Reservation at restaurant", LocalDate.of(2021,5,10),LocalDate.of(2021,11,1)));
       tasks.add(new Task("Menu confirmation", LocalDate.of(2021,5,10),LocalDate.of(2021,11,5)));
       tasks.add(new Task("Dining-room decoration", LocalDate.of(2021,8,1),LocalDate.of(2021,12,15)));
       return tasks;
   }
}




