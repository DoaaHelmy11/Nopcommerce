@smoke
  Feature: F04_Search | user can search for any product on the website and get relative results

    Scenario Outline: user can search for any product on the website by name
      When user search for <productname>
      Then user gets relative products for <productname>

      Examples:
      | productname |
      | Mac         |
      | Lenovo      |
      | Laptop |

    Scenario Outline: user can search for specific product by SKU
      When user search for <SKU>
      Then user gets the only relative product

      Examples:
        | SKU |
        | N_1020_LU |
        | COMP_CUST |
        | AP_MBP_13 |