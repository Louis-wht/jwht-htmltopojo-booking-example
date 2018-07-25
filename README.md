# jwht-htmltopojo-booking-example

Example usage of Booking.com destination finder endorsments HTML page parsing with jwht-htmltopojo lib.


We used this page : [Alesund city in Norway : Booking endorsements](https://www.booking.com/destinationfinder/cities/no/alesund/endorsements.en-gb.html)

The resulting html file is store in the project repository to avoid 
scrapping illegally booking website. This is just provided as a very
simple example and showcase some basic things you can do with this 
library. 

There is a lot to explore and having a look at all annotations and 
source code could help you find some interesting use cases.


## Output Examples

Without filtering endorsements :

```
BookingEndorsementPage{cityName='Ålesund', bookingEndorsements=[
BookingEndorsement{endorsementName='Scenery', endorsementsCount=1621, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Hiking', endorsementsCount=342, question='What's your top piece of advice for a first-time hiker in Ålesund?', answer='"Climb up the steps to Fjellstua, hike to Gangstovika from Byparken, hike around Sukkertoppen in Hessa."'}
BookingEndorsement{endorsementName='Nature', endorsementsCount=1363, question='Describe the nature in Ålesund.', answer='"Hills, wide fjords with ample scope for hiking and nature photography."'}
BookingEndorsement{endorsementName='Local food', endorsementsCount=122, question='Why does the local food in Ålesund get such good reviews?', answer='"fishsoup and fish."'}
BookingEndorsement{endorsementName='City walks', endorsementsCount=1775, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Architecture', endorsementsCount=1642, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Harbours', endorsementsCount=1133, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Atmosphere', endorsementsCount=1090, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Sightseeing', endorsementsCount=914, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Mountains', endorsementsCount=815, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Aquariums', endorsementsCount=715, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Ambience', endorsementsCount=495, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Old Town', endorsementsCount=413, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Friendly locals', endorsementsCount=408, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Relaxation', endorsementsCount=396, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Seafood', endorsementsCount=374, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Tranquillity', endorsementsCount=360, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Walking', endorsementsCount=343, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Seaside', endorsementsCount=341, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Food', endorsementsCount=338, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Nature walks', endorsementsCount=337, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Clean air', endorsementsCount=294, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='City trips', endorsementsCount=272, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Sunsets', endorsementsCount=246, question='', answer='NO_VALUE'}
]}
```


Filtering out endorsements containing the term "city" :

```
BookingEndorsementPage{cityName='Ålesund', bookingEndorsements=[
BookingEndorsement{endorsementName='Scenery', endorsementsCount=1621, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Hiking', endorsementsCount=342, question='What's your top piece of advice for a first-time hiker in Ålesund?', answer='"Climb up the steps to Fjellstua, hike to Gangstovika from Byparken, hike around Sukkertoppen in Hessa."'}
BookingEndorsement{endorsementName='Nature', endorsementsCount=1363, question='Describe the nature in Ålesund.', answer='"Hills, wide fjords with ample scope for hiking and nature photography."'}
BookingEndorsement{endorsementName='Local food', endorsementsCount=122, question='Why does the local food in Ålesund get such good reviews?', answer='"fishsoup and fish."'}
BookingEndorsement{endorsementName='Architecture', endorsementsCount=1642, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Harbours', endorsementsCount=1133, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Atmosphere', endorsementsCount=1090, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Sightseeing', endorsementsCount=914, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Mountains', endorsementsCount=815, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Aquariums', endorsementsCount=715, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Ambience', endorsementsCount=495, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Old Town', endorsementsCount=413, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Friendly locals', endorsementsCount=408, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Relaxation', endorsementsCount=396, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Seafood', endorsementsCount=374, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Tranquillity', endorsementsCount=360, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Walking', endorsementsCount=343, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Seaside', endorsementsCount=341, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Food', endorsementsCount=338, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Nature walks', endorsementsCount=337, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Clean air', endorsementsCount=294, question='', answer='NO_VALUE'}
BookingEndorsement{endorsementName='Sunsets', endorsementsCount=246, question='', answer='NO_VALUE'}
]}
```

