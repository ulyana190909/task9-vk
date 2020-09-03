package ru.netology.manager;

import ru.netology.domain.Post;

public class SearchManager {
    //Позволяет искать записи на стене в соответствии с заданными критериями.

    private Post[] posts;
    private int idOwner;     //идентификатор пользователя или сообщества
    private int domain;      //короткий адрес пользователя или сообщества.
    private String query;    //поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках
    private int ownersOnly;  //возвращать только записи от имени владельца стены
    private int count;       //количество записей, которые необходимо вернуть.
    private int offset;      //смещение, необходимо для получения определенного подмножества результатов

    public Post[] search() {
        //TODO:: add logic
        return null;
    }
}
