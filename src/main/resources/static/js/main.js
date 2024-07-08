document.addEventListener("DOMContentLoaded", () => {
    let count = 0;

    const countDisplay = document.getElementById("countDisplay");
    const incrementButton = document.getElementById("increment");
    const decrementButton = document.getElementById("decrement");

    // Function to update the display
    function updateDisplay() {
        countDisplay.textContent = count;
    }

    // Add event listeners to the <p> tags
    incrementButton.addEventListener("click", () => {
        count++;
        updateDisplay();
    });

    decrementButton.addEventListener("click", () => {
        count--;
        updateDisplay();
    });

    // Initialize the display
    updateDisplay();
});
