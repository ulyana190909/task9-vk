package ru.netology.domain;

public class Post {
    private String createPost;        //создать пост
    private String delete;            //удалить пост
    private String sendToFriend;      //отправить друзьям
    private String savePost;          //сохранить пост
    private boolean pinPost;          //закрепить пост на главной страниц
    private String comment;           //оставить комментарий
    private boolean pinned;           //закреплена ли запись
    private boolean edit;             //возможно ли редактирование запись
    private double data;              //дата создания поста
    private double time;              //время создания поста
    private String creatorName;       //имя создателя поста
    private String linkOfCreator;     //ссылка на создателя поста
    private String text;              //текст поста
    private String id;                //id записи
    private String idCreator;         //id страницы создателя поста
    private int idOwner;              //id владельца стены, на которой опубликована запись
    private String type;              //тип записи
    private boolean makedAsAds;       //содержит ли запись отметку "реклама"
    private String platform;          //тип платформы с которой опубликована запись
    private String typePostSourse;    //тип источника
    private String urlSourse;         //URL устроиства с которого опубликована запись
    private InfoAudio infoAudio;      //информация про вложенные в пост аудиозаписи
    private InfoDocument infoDocument;//информация про вложенные в пост документы
    private InfoGeo infoGeo;          //информация про отметку в посте о месторасположении
    private InfoLike infoLike;        //информация про отметки "мне нравится" в посте
    private InfoPhoto infoPhoto;      //информация про вложенные в пост изображения
    private InfoReviewPost infoReviewPost; //информация про просмотры поста
    private InfoVideo infoVideo;      //информация о видеозаписях в посте

    private int ownerId = -1;          //идентификатор пользователя или сообщества, на стене которого находится запись.
    private int postId;                //идентификатор записи на стене

    public int getCount() {
        return count;
    }

    private int domain;                //короткий адрес пользователя или сообщества.
    private String query;              //поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках
    private int ownersOnly;            //возвращать только записи от имени владельца стены
    private int count;                 //количество записей, которые необходимо вернуть.
    private int offset;                //смещение, необходимо для получения определенного подмножества результатов

        // + get/set на все поля
    }
