package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager{
    private Post post;
    private int ownerId = -1;     //идентификатор пользователя или сообщества, на стене которого находится запись.
    private int postId;      //идентификатор записи на стене

    private int idOwner;     //идентификатор пользователя или сообщества
    private int domain;      //короткий адрес пользователя или сообщества.
    private String query;    //поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках
    private int ownersOnly;  //возвращать только записи от имени владельца стены
    private int count;       //количество записей, которые необходимо вернуть.
    private int offset;      //смещение, необходимо для получения определенного подмножества результатов

    // + get/set на все поля

    public Post[] search() {
        Post post = new Post();
    //TODO:: add logic
        return Post [];
    }

    public void delete () {
        //TODO:: add logic
    return;
    }
}
