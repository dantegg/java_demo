package com.dantegg.shop.utils;

public class Pager {
    // 1. 当前页码
    private int pageIndex;
    // 2. 一页需要展示多少条数据
    private int pageSize = 3;
    // 3. 当前条件下总的数据量
    private int totalCount;



    // 4.总共分多少页
    private int totalPages;

    public int getPageIndex() {
        pageIndex = pageIndex <= 0 ? 1: pageIndex;
        pageIndex = pageIndex >= getTotalPages() ? getTotalPages() : pageIndex;
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPages() {
        return (this.getTotalCount() -1 )/ this.getPageSize() + 1;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getFirstParam()  {
        return (this.getPageIndex() -1)* this.getPageSize();
    }

}
