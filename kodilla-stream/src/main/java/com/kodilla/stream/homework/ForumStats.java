package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOfPostsOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >=40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n ->n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users 40 years old or more is : " + avgOfPostsOver40);


        double avgOfPostsUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(u-> u.getAge() <=40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users 40 years old or younger is: " + avgOfPostsUnder40);

    }
}

