package ru.netology.domain;

public class InfoVideo {
    private int idVideo;         //id видео
    private int idOwnerVideo;    //id владельца видео
    private String title;        //название видео
    private int duration;        //длительность видео
    private String urlVideo;     //URL видео
    private int idAlbumVideo;    //id альбома, где находиться видео
    private String textVideo;    //текст видео
    private int height;          //высота видео
    private int widht;           //ширина видео
    private double dataVideo;    //дата рамещения видео
    private int viewVideo;       //количество просмотров видео
    private int commentVideo;    //количество комментриев под видео
    private String urlPlayer;    //URl плеера, через который осуществляется просмотр
    private String namePlatform; //название платформы плеера
    private boolean edit;        //возможность редактировать текст под видео
    private boolean add;         //возможность добавить видио другим пользователям

    // + get/set на все поля
}