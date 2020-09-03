package ru.netology.manager;

import ru.netology.domain.*;

public class PostManager {
    private Post[] posts;
    private DeleteManager deleteManager;
    private SearchManager searchManager;

    public String generate() {
       DeleteManager[] deleteManagers = DeleteManager.getDelete();
       SearchManager[] searchManagers = SearchManager.getSearch();
        //TODO:: add logic
        return null;
    }
}
