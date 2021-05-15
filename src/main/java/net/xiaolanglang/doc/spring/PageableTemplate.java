package net.xiaolanglang.doc.spring;

/**
 * Abstract interface for pagination information.
 *
 * @author Oliver Gierke
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
     * sorting parameters.
     */
    private String sort;
}
