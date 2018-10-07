package baseclass;

import java.util.List;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 14:57
 **/

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
