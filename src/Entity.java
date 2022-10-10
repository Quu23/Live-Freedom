/**
 * すべてのゲームオブジェクトを表すクラス
 * ブロックなどの地形は含まれない
 * あくまで"動くもの"
 */
public class Entity {
    
    private int x;
    private int y;
    private int mathX;
    private int mathY;
    private int moveSpeed;
    public static final int IMAGE_INDEX; 

    Entity(int x,int y){
        this.x=x;
        this.y=y;
    }

    public boolean isHit(Entity target) {
        if(this.mathX==target.mathX&&this.mathY==target.mathY){
            return true;
        }
        return false;
    }
    public void move(Direction d) {
        switch (d) {
            case NORTH:
                this.y-=this.moveSpeed;
                this.mathY=(int)Math.floor(this.y/5.0);
                break;
            case WEST:
                this.x+=this.moveSpeed;
                this.mathX=(int)Math.floor(this.x/5.0);
                break;
            case SOUTH:
                this.y+=this.moveSpeed;
                this.mathY=(int)Math.floor(this.y/5.0);
                break;
            case EAST:
                this.x-=this.moveSpeed;
                this.mathX=(int)Math.floor(this.x/5.0);
                break;
            default:
                break;
        }
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getMathX() {
        return mathX;
    }
    public int getMathY() {
        return mathY;
    }
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
