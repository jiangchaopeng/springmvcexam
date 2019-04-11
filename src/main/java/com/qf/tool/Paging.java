package com.qf.tool;

public class Paging {
    //总页数
    int countPage;
    //当前页
    int currentPage;
    //总条数
    int countSum;
    //每一页显示条数
    int pageSize =3;

    int start;

    public int getStart() {
        this.start=(currentPage-1)*pageSize;
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCountPage() {
        this.countPage = this.countSum%pageSize==0?this.countSum/pageSize:this.countSum/pageSize+1;
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "countPage=" + countPage +
                ", currentPage=" + currentPage +
                ", countSum=" + countSum +
                ", pageSize=" + pageSize +
                ", start=" + start +
                '}';
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCountSum() {
        return countSum;
    }

    public void setCountSum(int countSum) {
        this.countSum = countSum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
