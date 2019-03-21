let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
{ id: 1, name: 'Oatmeal', completed: false },
{ id: 2, name: 'Milk', completed: false },
{ id: 3, name: 'Banana', completed: false },
{ id: 4, name: 'Strawberries', completed: false },
{ id: 5, name: 'Lunch Meat', completed: false },
{ id: 6, name: 'Bread', completed: false },
{ id: 7, name: 'Grapes', completed: false },
{ id: 8, name: 'Steak', completed: false },
{ id: 9, name: 'Salad', completed: false },
{ id: 10, name: 'Tea', completed: false }
];

/**

This function will get a reference to the title and set its text to the value
of the pageTitle variable that was set above.
*/
function setPageTitle() {
const title = document.getElementById('title');
title.innerText = pageTitle;
}
/**

This function will loop over the array of groceries that was set above and add them to the DOM.
*/
function displayGroceries() {
const ul = document.querySelector('ul');
groceries.forEach((item) => {
const li = document.createElement('li');
li.innerText = item.name;
const checkCircle = document.createElement('i');
checkCircle.setAttribute('class', 'far fa-check-circle');
li.appendChild(checkCircle);
ul.appendChild(li);
});
}
document.addEventListener("DOMContentLoaded", () => {

setPageTitle();
displayGroceries();

const shopping = document.querySelectorAll('li');

shopping.forEach((grocery) => {

//when clicking on grocery mark it completed
grocery.addEventListener('click', () => {
  if (!grocery.hasAttribute('class', 'completed')) {
    grocery.classList.add('completed')
    grocery.querySelector('i').classList.add('completed')
  }
});

// when you double click a grocery remove the completed class
grocery.addEventListener('dblclick', () => {
  if (grocery.hasAttribute('class', 'completed')) {
    grocery.classList.remove('completed');
    grocery.querySelector('i').classList.remove('completed');
  }
});
});

// mark all grocery as completed
const completeAll = document.getElementById('toggleAll')
completeAll.addEventListener('click', () => {
  shopping.forEach((grocery) => {
if (grocery.classList.contains('completed')){
grocery.classList.remove('completed');
grocery.querySelector('i').classList.remove('completed');
completeAll.innerText = "MARK ALL COMPLETED";
}
else {
grocery.classList.add('completed');
grocery.querySelector('i').classList.add('completed');
completeAll.innerText = "MARK ALL INCOMPLETE";
}
});
});

});