package com.mouritech.onlineshoppingsystem.entity;




import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;





@Entity
@Table(name = "cart")
public class Cart  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private long cartId;
	
	@Column(name = "quantity")
	private int quantity;

	 
	 @ManyToOne(fetch = FetchType.LAZY,optional = false)
		
		@OnDelete(action = OnDeleteAction.CASCADE)
	    @JoinColumn(name = "product_id", nullable = false)
	    private Product product;

	public Cart(long cartId, int quantity, Product product) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
		this.product = product;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", quantity=" + quantity + "]";
	}
	

	public Cart(long cartId, String content) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
	}

	public Cart(String quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}


	
	
	

//	@OneToMany(mappedBy = "cart", fetch = FetchType.LAZY)
//	@JoinColumn(name = "prodId")
//  @OnDelete(action = OnDeleteAction.CASCADE)
//	private Product product;

//	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
//	private Set<Product> products = new HashSet<>();

//	@OneToOne(cascade = CascadeType.PERSIST)
//     @JoinColumn(name = "custId")
//     @OnDelete(action = OnDeleteAction.CASCADE)
//	private Customer customer;

	





}
