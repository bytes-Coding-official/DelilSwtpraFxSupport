package de.bytescoding.javafx;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.*;
import java.awt.event.MouseAdapter;

public class GameTile extends StackPane {
    
    private Color color;

    private Circle circle;
    public GameTile(javafx.scene.paint.Color color) {
       circle = new Circle(50, color);
        this.color = color;
        //add mouse listener to change color
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            if (this.color == Color.BLACK) {
                this.color = Color.GOLD;
            } else {
                this.color = Color.BLACK;
            }
            circle.setFill(this.color);
        });
        
        
        label = new Label("TestText");
        this.getChildren().add(circle);
        this.getChildren().add(label);
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, this::mousePressedEvent );
        this.addEventHandler(MouseEvent.MOUSE_DRAGGED, this::mouseDraggedEvent );
}

    private Label label;

    private double lastX, lastY;
private void mousePressedEvent(MouseEvent event) {
    lastX = event.getSceneX();
    lastY = event.getSceneY();
}

private void mouseDraggedEvent(MouseEvent event) {
    double deltaX = event.getSceneX() - lastX;
    double deltaY = event.getSceneY() - lastY;
    setLayoutX(getLayoutX() + deltaX);
    setLayoutY(getLayoutY() + deltaY);
    lastX = event.getSceneX();
    lastY = event.getSceneY();
}
}
