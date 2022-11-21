package com.taha.mohammad.entity;

import javax.persistence.*;

@Entity
public class Student {
   //OnetoOne (Example #1)
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int s_id;
   private String s_name;
   public int getS_id() {
      return s_id;
   }
   public void setS_id(int s_id) {
      this.s_id = s_id;
   }
   public String getS_name() {
      return s_name;
   }
   public void setS_name(String s_name) {
      this.s_name = s_name;
   }}

 /*  OnetoMany (Example #3)
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int s_id;
   private String s_name;

   @OneToMany(targetEntity=Library.class)
   private List books_issued;

   public List getBooks_issued() {
      return books_issued;
   }
   public void setBooks_issued(List books_issued) {
      this.books_issued = books_issued;
   }
   public int getS_id() {
      return s_id;
   }
   public void setS_id(int s_id) {
      this.s_id = s_id;
   }
   public String getS_name() {
      return s_name;
   }
   public void setS_name(String s_name) {
      this.s_name = s_name;
   }
*/

/*
    Many-to-One (Example 3)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int s_id;
    private String s_name;

    @ManyToOne
    private Library lib;

    public int getS_id() {
        return s_id;
    }
    public void setS_id(int s_id) {
        this.s_id = s_id;
    }
    public String getS_name() {
        return s_name;
    }
    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
    public Library getLib() {
        return lib;
    }
    public void setLib(Library lib) {
        this.lib = lib;
    }

      */

/*    (Many-to-Many)Example #4
    @Id
    @GeneratedValue
    private int s_id;
    private String s_name;

    @ManyToMany(targetEntity=Library.class)
    private List lib;



    public Student(int s_id, String s_name, List lib) {
        super();
        this.s_id = s_id;
        this.s_name = s_name;
        this.lib = lib;
    }



    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }



    public List getLib() {
        return lib;
    }
    public void ListLib(List lib) {
        this.lib = lib;
    }
    public int getS_id() {
        return s_id;
    }
    public void ListS_id(int s_id) {
        this.s_id = s_id;
    }
    public String getS_name() {
        return s_name;
    }
    public void ListS_name(String s_name) {
        this.s_name = s_name;
    }
    }  */


