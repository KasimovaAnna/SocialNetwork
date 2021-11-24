package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int datePost;
    private String namePost;
    private String text;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private GeoInfo geoInfo;
}
