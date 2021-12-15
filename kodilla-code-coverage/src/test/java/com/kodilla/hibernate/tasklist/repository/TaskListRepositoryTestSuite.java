package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    public void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("To do", "Xmas Shopping");
        taskListRepository.save(taskList);
        String listName = taskList.getListName();


        // When
        List<TaskList> readListName = taskListRepository.findByListName(listName);


        // Then
        Assert.assertEquals(1, readListName.size());


        // CleanUp
        taskListRepository.deleteAll();
    }
}
