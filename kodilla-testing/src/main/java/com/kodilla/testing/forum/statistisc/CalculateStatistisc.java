package com.kodilla.testing.forum.statistisc;

public class CalculateStatistisc {
    private Statistisc statistisc;
    private double postsOnUsers;
    private double commentsOnUsers;
    private double commentsOnPosts;

    public CalculateStatistisc(Statistisc statistisc) {
        this.statistisc = statistisc;
    }


    public void calculateAdvStatistic(Statistisc statistisc){

            postsOnUsers = (double)statistisc.postCount() / (double)statistisc.usersNames().size();
            commentsOnUsers = (double)statistisc.commentsCount() / (double)statistisc.usersNames().size();
            commentsOnPosts = (double)statistisc.commentsCount() / (double)statistisc.postCount();

    }

    public double getPostsOnUsers() {
        return postsOnUsers;
    }

    public double getCommentsOnUsers() {
        return commentsOnUsers;
    }

    public double getCommentsOnPosts() {
        return commentsOnPosts;
    }

    public void showStatistisc(){
        System.out.println("Average value of Posts on 1 user: " + postsOnUsers);
        System.out.println("Average value of Comments on 1 user: " + commentsOnUsers);
        System.out.println("Average value of Comments on 1 post: " + commentsOnPosts);
    }

}
