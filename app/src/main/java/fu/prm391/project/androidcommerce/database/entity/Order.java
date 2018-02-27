package fu.prm391.project.androidcommerce.database.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Lam on 2/28/2018.
 */

@Entity(tableName = "Order", foreignKeys = @ForeignKey(entity = PaymentType.class, parentColumns = "paymentTypeId", childColumns = "paymentTypeId", onDelete = CASCADE, onUpdate = CASCADE))
public class Order {
    @PrimaryKey(autoGenerate = true)
    private int orderId;

    @ColumnInfo(name = "userId")
    private int userId;

    @ColumnInfo(name = "paymentTypeId")
    private int paymentTypeId;

    @ColumnInfo(name = "paymentAmount")
    private int paymentAmount;

    @ColumnInfo(name = "orderDate")
    private Date orderDate;

    @ColumnInfo(name = "shipDate")
    private Date shipDate;

    @ColumnInfo(name = "paymentDate")
    private Date paymentDate;

    @ColumnInfo(name = "checkedOut")
    private boolean checkedOut;

    public Order(int userId, int paymentTypeId, int paymentAmount, Date orderDate, Date shipDate, Date paymentDate, boolean checkedOut) {
        this.userId = userId;
        this.paymentTypeId = paymentTypeId;
        this.paymentAmount = paymentAmount;
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.paymentDate = paymentDate;
        this.checkedOut = checkedOut;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}