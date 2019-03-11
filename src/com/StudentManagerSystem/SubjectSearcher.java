
package com.StudentManagerSystem;

import java.util.LinkedList;

public class SubjectSearcher {


    private int id;
    private int index;
    private String title = "";
    private Boolean searchById = false;
    private Boolean searchByTitle = false;

//    private LinkedList<Subject> subjects = new LinkedList<>();
//    private LinkedList<Integer> indexes_title = new LinkedList<>();

    private Integer searchResultId = -1;
    private LinkedList<Integer> searchResultTitle = null;
















///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods



    public void matchResults() {

        if (searchById)
            index = searchResultId;
        else
            index = searchResultTitle.pop();
    }













//////////////////////////////////////////////////////////Getters and Setters
//////////////////////////////////////////////////////////Getters and Setters
//////////////////////////////////////////////////////////Getters and Setters
//////////////////////////////////////////////////////////Getters and Setters




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //
    public Boolean getSearchById() {
        return searchById;
    }

    public void setSearchById(Boolean searchById) {
        this.searchById = searchById;
    }

    public Boolean getSearchByTitle() {
        return searchByTitle;
    }

    public void setSearchByTitle(Boolean searchByTitle) {
        this.searchByTitle = searchByTitle;
    }

    public Integer getSearchResultId() {
        return searchResultId;
    }

    public void setSearchResultId(Integer searchResultId) {
        this.searchResultId = searchResultId;
    }

    public LinkedList<Integer> getSearchResultTitle() {
        return searchResultTitle;
    }

    public void setSearchResultTitle(LinkedList<Integer> searchResultTitle) {
        this.searchResultTitle = (LinkedList<Integer>) searchResultTitle.clone();
    }
}
