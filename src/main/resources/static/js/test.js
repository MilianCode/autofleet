// Function to handle making requests to the backend
async function makeApiRequest(url, options = {}) {
    try {
        const response = await fetch(url, options);

        if (response.status === 401) {
            // Redirect to login page if the response is 401 Unauthorized
            window.location.href = "/login";  // Redirect to your login page
            return;
        }

        // Handle other successful responses (if needed)
        const data = await response.json();
        return data;
    } catch (error) {
        console.error('Error:', error);
    }
}
