package ru.netology.domain;

public class VkPost {
    public String createPost;        //создать пост
    public String delete;            //удалить пост
    public String sendToFriend;      //отправить друзьям
    public String savePost;          //сохранить пост
    public String comment;           //оставить комментарий

    // + get/set на все поля
}

class infoPost {
    public double data;              //дата создания поста
    public double time;              //время создания поста
    public String creatorName;       //имя создателя поста
    public String linkOfCreator;     //ссылка на создателя поста
    public String text;              //текст поста

    // + get/set на все поля
}


class Review {
    public int like;                 //количество лайков
    public int numberOfView;         //количество просмотров
    public int numberOfShares;       //количество репостов
    public int reviewComment;        //просмотр всех комментариев


// + get/set на все поля
}

