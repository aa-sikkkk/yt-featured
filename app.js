const videoSection = document.querySelector("section");
const loader = document.querySelector('.loader-box');

getVideos();

function getVideos() {
    fetch('https://youtube.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails&playlistId=PLEtNzPSBOVubGMuAk0wAtejQ3WGf1MijK&key=AIzaSyDl1IUMyjH7lEiNuu_Cnx37quExHsiE2fg')
        .then(res => res.json())
        .then(data => {
            loader.style.display = 'none'; 
            data.items.forEach(el => {
                videoSection.innerHTML += `<a target="_blank" href="https://www.youtube.com/watch?v=${el.snippet.resourceId.videoId}" class="yt-video"> <img src="${el.snippet.thumbnails.maxres.url}" /> <h2>${el.snippet.title}</h2></a>`;
            });
        })
        .catch(error => {
            loader.style.display = 'none'; // Fixed typo in "style" property
            console.error(error); // Changed console.log to console.error for better visibility of errors
            videoSection.innerHTML = '<h3>Sorry, something went wrong. Please try again later.</h3>';
        });
}
