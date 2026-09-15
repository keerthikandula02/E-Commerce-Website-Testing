# E-Commerce Test Cases

| TC ID | Scenario | Steps | Expected Result | Priority |
|---|---|---|---|---|
| EC-001 | Valid product search | Enter valid product keyword and search | Relevant products displayed | High |
| EC-002 | Invalid product search | Search random unavailable keyword | No-results message displayed | Medium |
| EC-003 | Add product to cart | Open product and click Add to Cart | Product appears in cart | High |
| EC-004 | Update quantity | Increase quantity from cart | Quantity and total update correctly | High |
| EC-005 | Remove product | Click Remove in cart | Product is removed | High |
| EC-006 | Invalid coupon | Apply invalid coupon | Validation message displayed | Medium |
| EC-007 | Checkout validation | Continue without mandatory address | User is prevented from continuing | High |
| EC-008 | Successful order | Complete valid checkout data | Order confirmation displayed | Critical |
| EC-009 | Price calculation | Add multiple products | Subtotal, tax and total are correct | High |
| EC-010 | Session/cart persistence | Add item, refresh page | Cart state remains correct | Medium |
