package ru.netology.domain;

public class VkPost {
    private String createPost;        //создать пост
    private String delete;            //удалить пост
    private String sendToFriend;      //отправить друзьям
    private String savePost;          //сохранить пост
    private String comment;           //оставить комментарий
    private boolean pinned;           //закреплена ли запись
    private boolean edit;             //возможно ли редактирование записи
    private boolean onlyFriends;      //ограничение в просмотре (только для друзей)

    // + get/set на все поля
}

class infoPost {
    private double data;              //дата создания поста
    private double time;              //время создания поста
    private String creatorName;       //имя создателя поста
    private String linkOfCreator;     //ссылка на создателя поста
    private String text;              //текст поста
    private String id;                //id записи
    private String idCreator;         //id страницы создателя поста

    // + get/set на все поля
}


class Review {
    private int like;                 //количество лайков
    private int numberOfView;         //количество просмотров
    private int numberOfShares;       //количество репостов
    private int reviewComment;        //просмотр всех комментариев
    private String geo;               //информация о месторасположении


// + get/set на все поля
}

