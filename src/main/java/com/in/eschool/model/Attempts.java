package com.in.eschool.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Attempts { 
   @Id 
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String username; 
   private int attempts;
   
   /** 
   * @return the id 
   */ 
   public int getId() { 
      return id; 
   } 
   /** 
   * @param id the id to set 
   */ 
   public void setId(int id) {         
      this.id = id; 
   } 
   /** 
   * @return the username 
   */ 
   public String getUsername() { 
      return username; 
   }
   /** 
   * @param username the username to set 
   */ 
   public void setUsername(String username) { 
      this.username = username; 
   } 
   /** 
   * @return the attempts 
   */ 
   public int getAttempts() { 
      return attempts; 
   } 
   /** 
   * @param attempts the attempts to set 
   */ 
   public void setAttempts(int attempts) { 
      this.attempts = attempts; 
   } 
}