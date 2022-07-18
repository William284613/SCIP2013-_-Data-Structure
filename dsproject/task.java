package dsproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author williamng
 */
public class task {

    private String taskname, tasknote, priority, date;

    public task(String taskname, String tasknote, String priority, String date) {
        this.taskname = taskname;
        this.tasknote = tasknote;
        this.priority = priority;
        this.date = date;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTasknote() {
        return tasknote;
    }

    public void setTasknote(String tasknote) {
        this.tasknote = tasknote;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
