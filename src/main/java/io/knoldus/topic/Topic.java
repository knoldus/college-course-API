package io.knoldus.topic;

import io.knoldus.course.Course;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    @DBRef
    private Course course;

    public Topic() {
    }

    public Topic(String id, String name, String description, String courseId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = new Course(courseId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
