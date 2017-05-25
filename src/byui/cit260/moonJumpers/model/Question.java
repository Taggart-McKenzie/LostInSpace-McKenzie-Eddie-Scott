/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.moonJumpers.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author sshipp57
 */
public class Question implements Serializable{
    
    private String questions;
    private String answers;
    private String correctAnswers;
    private double equations;

    public Question() {
    }
    
    

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public double getEquations() {
        return equations;
    }

    public void setEquations(double equations) {
        this.equations = equations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.questions);
        hash = 97 * hash + Objects.hashCode(this.answers);
        hash = 97 * hash + Objects.hashCode(this.correctAnswers);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.equations) ^ (Double.doubleToLongBits(this.equations) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (Double.doubleToLongBits(this.equations) != Double.doubleToLongBits(other.equations)) {
            return false;
        }
        if (!Objects.equals(this.questions, other.questions)) {
            return false;
        }
        if (!Objects.equals(this.answers, other.answers)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswers, other.correctAnswers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Questions{" + "questions=" + questions + ", answers=" + answers + ", correctAnswers=" + correctAnswers + ", equations=" + equations + '}';
    }
    
    
    
}