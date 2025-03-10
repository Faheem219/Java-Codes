package com.example.todolistproject;

import com.example.todolistproject.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    @FXML
    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John with personalized gift",
                LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Doctor's Appointment", "See Dr.Smith at 123 Main Street for the Teethache",
                LocalDate.of(2016, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Final Design Proposal", "I promised Mike I'd email website mockups and drafts",
                LocalDate.of(2016, Month.APRIL, 22));
        TodoItem item4 = new TodoItem("Pickup Doug", "Doug's arriving on platform 5 on train station at 5:30pm",
                LocalDate.of(2016, Month.MARCH, 15));
        TodoItem item5 = new TodoItem("Pick up dry cleaning", "The clothes should be ready by the end of this week",
                LocalDate.of(2016, Month.APRIL, 20));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
                if(t1 != null){
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("The selected item is: " + item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());
        itemDetailsTextArea.setText((item.getDetails()));
        deadlineLabel.setText(item.getDeadline().toString());
    }
}