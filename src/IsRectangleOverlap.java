public class IsRectangleOverlap {
    public boolean issRectangleOverlap(int[] r1,int[] r2){
        return !(r1[2]<=r2[0] || r1[3]<=r2[1] || r1[0]>=r2[2] || r1[1] >=r2[3]);
    }

    public static void main(String[] args) {
        IsRectangleOverlap ro = new IsRectangleOverlap();
        System.out.println(ro.issRectangleOverlap(new int[]{0,0,2,2},new int[]{1,1,3,3}));
        System.out.println(ro.issRectangleOverlap(new int[]{0,0,1,1},new int[]{1,0,2,1}));
        System.out.println(ro.issRectangleOverlap(new int[]{0,0,1,1},new int[]{2,2,3,3}));

        }

    }

