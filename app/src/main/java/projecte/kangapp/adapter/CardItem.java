package projecte.kangapp.adapter;

import android.graphics.drawable.Drawable;

/**
 * Created by sergi on 24/5/15.
 */
public class CardItem {

    private int itemImageId;
    private String itemName;
    private String userName;
    private String itemState;
    private String itemPrice;
    private String itemBeginEndDate;
    
    public CardItem (int itemImageId, String itemName, String userName, String itemState, String itemPrice, String itemBeginEndDate){
        this.itemImageId = itemImageId;
        this.itemName = itemName;
        this.userName = userName;
        this.itemState = itemState;
        this.itemPrice = itemPrice;
        this.itemBeginEndDate = itemBeginEndDate;
    }
    
    public void setItemImageId(int itemImageId){
        this.itemImageId = itemImageId;
    }
    
    public int getItemImageId(){
        return itemImageId;
    }
    
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public void setItemState(String itemState){
        this.itemState = itemState;
    }
    
    public String getItemState(){
        return itemState;
    }
    
    public void setItemPrice(String itemPrice){
        this.itemPrice = itemPrice;
    }
    
    public String getItemPrice(){
        return itemPrice;
    }
    
    public void setItemBeginEndDate(String itemBeginEndDate){
        this.itemBeginEndDate = itemBeginEndDate;
    }
    
    public String getItemBeginEndDate(){
        return itemBeginEndDate;
    }
}