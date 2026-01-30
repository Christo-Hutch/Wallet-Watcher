# Plan / To-Do-List
> For Wallet-Watcher Project.

## Structure of App

<ul>
  <li>
    Hexagonal Architecture
    <ul>
      <li>Seperation of logic, connections and interfaces</li>
      <li>Allows for improved maintainability</li>
    </ul>
  </li>
</ul>



## Features of App 
> In order of implementation
<ul>
  <li>
    Add accounts
    <ul>
      <li>Current Account</li>
      <li>
        Savings
        <ul>
          <li>Projected interest earnings</li>
        </ul>
      </li>
      <li>
        Credit Card
        <ul>
          <li>Ability to change statement & payment date</li>
          <li>Total interest added on account overview page</li>
          <li>Notification warnings for overdue payment</li>
        </ul>
      </li>
      <li>
        Investment (Eventually linked to T212 API)
        <ul>
          <li>Projected earnings calculator</li>
        </ul>
      </li>
    </ul>
  </li> 
  <li>
    Add transactions
    <ul>
      <li>Income</li>
      <li>Expense</li>
      <li>Transfer</li>
      <li>Categories</li>
    </ul>
  </li>
  <li>
    Budgeting
	<ul>
	  <li>Set monthly spending budgets</li>
	  <li>Set spening budgets based on categories</li>
	</ul>
  </li>
  <li>
    UI
	<ul>
	  <li>Terminal-based</li>
	  <li>GUI (Final feature)</li>
	</ul>
  </li>
</ul>


## Timeline of Targets
At each target the user should be able to:
<ol>
	<li>Add accounts of one type (current account) to database.</li>
	<li>Add transactions of most types (income, expense, excluding transfers) to account.</li>
	<li>Implement a terminal UI for the user to interact with the app and perform the previous targets.</li>
	<li>Add accounts of one type (savings) to database.</li>
</ol>