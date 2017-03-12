# Amazon Echo Bridge &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![codeship status](https://codeship.com/projects/998e16f0-ca03-0132-6689-76c03995407a/status?branch=master)

I was quite happy with armzilla/amazon-echo-ha-bridge, but startup on my
raspberry pi took more than four minutes, so I wondered if I could speed
it up by replacing the ElasticSearch backend with hibernate and an embedded
database like H2.

Long storry short, I only gained about 10s, so in the end I don't consider
it worth the effort. Still, if you run a little database daemon anyway,
you might have bigger benefits, so I don't delete this fork.

But it is certainly more proof-of-concept than fit-for-production.
