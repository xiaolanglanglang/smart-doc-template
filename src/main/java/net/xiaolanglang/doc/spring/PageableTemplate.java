package net.xiaolanglang.doc.spring;

/**
 * For pagination information.
 */
@SuppressWarnings("unused")
public class PageableTemplate {
    /**
     * The page to be returned.
     */
    private Integer page;
    /**
     * The number of items to be returned.
     */
    private Integer size;

    /**
     * Sorting parameters.
     */
    private String sort;
}
