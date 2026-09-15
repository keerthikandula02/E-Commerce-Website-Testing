# Sample Bug Reports

## BUG-EC-001 — Cart total not refreshed after quantity update
**Severity:** High | **Priority:** High | **Status:** Open

**Steps:** Add a product → open cart → change quantity from 1 to 2.

**Expected:** Total updates immediately using the new quantity.

**Actual:** Displayed total remains unchanged until page refresh.

## BUG-EC-002 — Invalid coupon gives unclear message
**Severity:** Medium | **Priority:** Medium | **Status:** Open

**Steps:** Open checkout → enter invalid coupon → Apply.

**Expected:** Clear message such as “Coupon code is invalid”.

**Actual:** Generic error text is shown.
