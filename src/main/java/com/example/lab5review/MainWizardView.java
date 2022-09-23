package com.example.lab5review;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.apache.coyote.http11.Http11InputBuffer;

@Route(value = "mainpage.it")
public class MainWizardView extends VerticalLayout {
    private TextField fullName, dollars;
    private RadioButtonGroup<String> gender;
    private ComboBox position, school, house;
    private HorizontalLayout h1;
    private Button left, right, create, update, delete;
    public MainWizardView() {
        fullName = new TextField();
        dollars = new TextField();
        gender = new RadioButtonGroup<>();
        position = new ComboBox();
        school = new ComboBox();
        house = new ComboBox();
        h1 = new HorizontalLayout();
        left = new Button("<<");
        right = new Button(">>");
        create = new Button("Create");
        update = new Button("Update");
        delete = new Button("Delete");

        fullName.setPrefixComponent(new Span("Fullname"));
        dollars.setPrefixComponent(new Span("$"));
        position.setItems("Student", "Teacher");
        position.setPlaceholder("Position");
        school.setPlaceholder("School");
        school.setItems("Hogwarts", "Beauxbatons", "Durmstang");
        house.setPlaceholder("House");
        house.setItems("Gryffindor", "Revanclaw", "Hufflepuff", "Slyther");
        gender.setItems("Male" , "Female");
        dollars.setLabel("Dollars");
        h1.add(left, create, update, delete, right);
        this.add(fullName, gender, position, dollars, school, house, h1);
    }
}
